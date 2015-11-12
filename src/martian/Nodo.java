/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martian;
/**
 *
 * @author erikbv99421
 */
public class Nodo {
    static int costoLateral_ = 10;
    static int costoDiagonal_ =14;
    int f_; //f=g+h
    int x_,y_;
    boolean definitivo_=false;
    int fpadre_;
    int cpadre_;
    Nodo nPadre_;
    Nodo nSucesor_;
    public Nodo(int f,int c) { //nodo final
        x_=f;
        y_=c;
        Costs();
    }
    public Nodo(int f,int c,Nodo n) {
        x_=f;
        y_=c;
        Costs(n);
    }
    private void Costs() {  //nodo final no tiene coste
        f_=0;
    }
    public void set_padre(int f,int c) {
        fpadre_=f;
        cpadre_=c;
    }
    public int get_fpadre() {
        return fpadre_;
    }
    public int get_cpadre() {
        return cpadre_;
    } 
    public void set_nPadre(Nodo n) {
        nPadre_=n;
    }
    public Nodo get_nPadre() {
        return nPadre_;
    }
    public void set_nSucesor(Nodo n) {
        nSucesor_=n;
    }
    public Nodo get_nSucesor() {
        return nSucesor_;
    }
    private void Costs(Nodo n) {
        System.out.println("martian.Nodo.Costs()"+ n.x_ +n.y_);
        f_=(Math.abs(n.x_-x_)*costoLateral_+Math.abs(n.y_-y_)*costoLateral_)+costoLateral_;
        //f_=Math.abs(n.x_-x_)*costoLateral_+Math.abs(n.y_-y_)*costoLateral_;
        System.out.println("martian.Nodo.Costs()"+f_);
    }
    public int get_cost() {
        return f_;
    }
    public int get_g() {
        return f_-costoLateral_;
    }
    public void set_definitivo() {
        definitivo_=true;
    }
    public boolean isDefinitivo() {
        return definitivo_;
    }
}
    
