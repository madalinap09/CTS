package ro.ase.acs.main;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class IoC {
	
	private Map<Class<?>, Class<?>> map = new HashMap<>();
	
	public void register(Class<?> contract, Class<?> implementation) {
		if(!map.containsKey(contract)) {
			map.put(contract, implementation);
		}
	}

	public <T> T resolve(Class<?> contract) {
		try {
			return (T) map.get(contract).getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}
