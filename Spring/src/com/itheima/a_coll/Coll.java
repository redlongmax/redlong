package com.itheima.a_coll;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Coll {
	private String[] str;
	private Properties properties;
	private Set<String> set;
	private List<String> list;
	@Override
	public String toString() {
		return "Coll [str=" + Arrays.toString(str) + ", properties=" + properties + ", set=" + set + ", list=" + list
				+ ", map=" + map + "]";
	}
	public String[] getStr() {
		return str;
	}
	public void setStr(String[] str) {
		this.str = str;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	private Map<String, String> map;
}
