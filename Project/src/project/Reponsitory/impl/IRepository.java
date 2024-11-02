/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.Reponsitory.impl;

import java.util.List;

/**
 *
 * @author thais
 */
public interface IRepository<T> {
    List<T> getList();
    void add(T obj);
    void edit(List<String> stringList);
    void delete(List<String> stringList);  
}
