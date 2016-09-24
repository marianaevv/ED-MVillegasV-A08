/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaslinealesdobles;

/**
 *
 * @author Mariana Villegas
 */
public class nodeDL<T> {
nodeDL next;
T data;
nodeDL prev;
 public nodeDL(T data){
     this.data = data;
 }
}
