package org.shersfy.timmer.starter.selector;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class TimmerSelector implements EnvironmentAware, BeanClassLoaderAware {

	private ClassLoader beanClassLoader;
	
	private Environment environment;
	
	public boolean isEnable() {
		return getEnvironment().getProperty("org.shersfy.timmer.enable", 
				Boolean.class, true);
	}
	
	@Override
	public void setBeanClassLoader(ClassLoader beanClassLoader) {
		this.beanClassLoader = beanClassLoader;

	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public ClassLoader getBeanClassLoader() {
		return beanClassLoader;
	}

	public Environment getEnvironment() {
		return environment;
	}

}
