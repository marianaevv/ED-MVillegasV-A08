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
public class ListasLinealesDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        douebleLnkList Lista = new douebleLnkList();
        Lista.insertFirst(34);
        Lista.insertFirst(3.675);
        Lista.insertFirst(true);
        Lista.insertFirst("Hola Persona");

        Lista.insertLast(78);
        Lista.insertLast(false);

        Lista.showList();
        System.out.println();
        System.out.println();

        Lista.showLastFirst();
        Lista.searchNode(34);
        Lista.eNODE(34);
        System.out.println();
        System.out.println();
        Lista.showList();
        System.out.println();
        System.out.println();
        Lista.eNodeFirst();
        Lista.showList();
        System.out.println();
        System.out.println();
        Lista.eNodeLast();
        Lista.showList();
        

    }

}
