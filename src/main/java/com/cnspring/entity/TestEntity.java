package com.cnspring.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestEntity {
  private String specialCharacter1;
  private String specialCharacter2;
  private User innerBean;
  private List<String> list;
  private String[] array;
  private Set<String> set;
  private Map<String,String> map;
  private Properties props;
  private String emptyValue;
  private String nullValue = "init Value";

  public String getSpecialCharacter1() {
    return specialCharacter1;
  }

  public void setSpecialCharacter1(String specialCharacter1) {
    this.specialCharacter1 = specialCharacter1;
  }

  public String getSpecialCharacter2() {
    return specialCharacter2;
  }

  public void setSpecialCharacter2(String specialCharacter2) {
    this.specialCharacter2 = specialCharacter2;
  }

  public User getInnerBean() {
    return innerBean;
  }

  public void setInnerBean(User innerBean) {
    this.innerBean = innerBean;
  }

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public String[] getArray() {
    return array;
  }

  public void setArray(String[] array) {
    this.array = array;
  }

  public Set<String> getSet() {
    return set;
  }

  public void setSet(Set<String> set) {
    this.set = set;
  }

  public Map<String, String> getMap() {
    return map;
  }

  public void setMap(Map<String, String> map) {
    this.map = map;
  }

  public Properties getProps() {
    return props;
  }

  public void setProps(Properties props) {
    this.props = props;
  }

  public String getEmptyValue() {
    return emptyValue;
  }

  public void setEmptyValue(String emptyValue) {
    this.emptyValue = emptyValue;
  }

  public String getNullValue() {
    return nullValue;
  }

  public void setNullValue(String nullValue) {
    this.nullValue = nullValue;
  }

  public void showValue(){
    System.out.println("????????????1: "+this.specialCharacter1);
    System.out.println("????????????2: "+this.specialCharacter2);
    System.out.println("??????Bean: "+this.innerBean.getUsername());
    System.out.println("List??????: "+this.list);
    System.out.println("????????????[0]: "+this.array[0]);
    System.out.println("Set??????: "+this.set);
    System.out.println("Map??????: "+this.map);
    System.out.println("Properties??????: "+this.props);
    System.out.println("??????????????????:["+this.emptyValue+"]");
    System.out.println("??????null???: "+this.nullValue);
  }
}