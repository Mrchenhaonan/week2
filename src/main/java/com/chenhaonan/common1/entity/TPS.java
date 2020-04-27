package com.chenhaonan.common1.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {//tps实体类
	private int id;
	private String name;
	private Integer age;
	private BigDecimal qian;
	private String rq;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id2 the id to set
	 */
	public void setId(int id2) {
		this.id = id2;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the qian
	 */
	public BigDecimal getQian() {
		return qian;
	}
	/**
	 * @param qian the qian to set
	 */
	public void setQian(BigDecimal qian) {
		this.qian = qian;
	}
	/**
	 * @return the rq
	 */
	public String getRq() {
		return rq;
	}
	/**
	 * @param d the rq to set
	 */
	public void setRq(String d) {
		this.rq = d;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", qian="
				+ qian + ", rq=" + rq + "]";
	}
	public TPS(int id, String name, Integer age, BigDecimal qian, String rq) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qian = qian;
		this.rq = rq;
	}
	public TPS() {
		super();
	}
	
}
