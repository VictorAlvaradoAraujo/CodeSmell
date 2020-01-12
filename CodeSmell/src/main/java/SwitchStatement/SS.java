/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatement;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author User
 */
public class SS {
    public static void example(String action, String from, String to){
        switch (action) {
           case ("run"):
                runTo(from,to);
                break;
           case ("walk"):
                walkTo(from,to);
                break;
           case ("hide"):
                hideAt(to);
                break;
            }
 }

    private static void runTo(String from, String to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void walkTo(String from, String to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void hideAt(String to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //CON REFACTORY SwitchStatement
    
    public interface FunctionExecutor {
    public Object execute(String from,String to);
    public class FunctionContect {
    HashMap<String, FunctionExecutor> context=new HashMap<String, FunctionExecutor>();

    public void register(String name,FunctionExecutor function){
        context.put(name, function);
    }

   public Object call(String name,String from,String to){
      return    context.get(name).execute(from, to);
   }

   public FunctionExecutor get(String name){
      return context.get(name);
   }

  }
    
}
    public class RunFunctionImpl implements FunctionExecutor{

    @Override
    public Object execute(String from, String to) {
       System.out.println("function run");
        return null;
   }

}
    /*
    FunctionContect contex = new FunctionContect();
    contex.register("run", new RunFunctionImpl());
    contex.register("walk", new WalkFunctionImpl());
    contex.register("hide", new HideFunctionImpl());*/
    //context.call(action, from, to);
    
}
