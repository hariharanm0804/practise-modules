package Concepts.Interview;

import javax.script.*;

public class Nashorn {
  
	public static void main(String[] args) throws ScriptException {
		ScriptEngine ss = new ScriptEngineManager().getEngineByName("Nashorn");
		ss.eval("print('Hello Java script');");
	}
}
