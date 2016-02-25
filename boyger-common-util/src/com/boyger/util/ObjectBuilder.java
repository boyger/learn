package com.boyger.util;

public interface ObjectBuilder<S,T>
{
	public T build(S s) throws Exception;
}
