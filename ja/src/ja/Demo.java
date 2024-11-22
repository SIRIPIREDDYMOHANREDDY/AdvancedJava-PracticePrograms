package ja;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Demo {
public static void main(String[] args) throws FileNotFoundException, ScriptException {
ScriptEngine se = new  ScriptEngineManager().getEngineByName("Nashron");	
se.eval(new FileReader("one.js"));	
	
}
}
