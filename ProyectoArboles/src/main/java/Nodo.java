/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dquin
 */
public class Nodo {
    private Nodo hijoIzq;
    private int elem;
    private Nodo hijoDer;
    
    public Nodo(int ele){
     hijoIzq=null;
     elem=ele;
     hijoDer=null;
    }
    public void setHI(Nodo izq){
        hijoIzq=izq;
    }
    public void setElem(int e){
        elem=e;
    }
    public void setHD(Nodo der){
        hijoDer=der;
    }
    public Nodo getHI(){
        return hijoIzq;
    }
    public int getElem(){
        return elem;
    }
    public Nodo getHD(){
        return hijoDer;
    }
    
}
