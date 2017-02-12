import java.util.function.Function;

import com.functional.model.SourceClass;
import com.functional.model.TargetClass;

public class Runner2 {
	
	private static TargetClass convert( SourceClass sourceClass ,Function<SourceClass,TargetClass> function){
		
		return function.apply(sourceClass);
		
	}

	public static void main(String[] args) {
		SourceClass sourceClass = new SourceClass();
		sourceClass.setName("abhinav");
		sourceClass.setRollnumber(1);
		
		
		Function<SourceClass,TargetClass> function = sourceClass1 -> {
			TargetClass targetClass = new TargetClass();
			targetClass.setLastName(sourceClass1.getName());
			targetClass.setEmpNumber(sourceClass1.getRollnumber());
			return targetClass;
		};
		
	TargetClass target =	convert(sourceClass,function);
	System.out.println(target.getLastName());
		
	}

}
