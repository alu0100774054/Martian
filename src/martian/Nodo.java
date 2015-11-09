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

    public Nodo(int f,int c) { //nodo final
        x_=f;
        y_=c;
        Costs();
    }
    public Nodo(int f,int c,Nodo n) {
        x_=f;
        y_=c;
        Costs();
    }
    private void Costs() {  //nodo final no tiene coste
        f_=0;
    }
    
    private void Costs(Nodo n) {
        f_=(Math.abs(n.x_-x_)*costoLateral_+Math.abs(n.y_-y_)*costoLateral_)+costoLateral_;
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
    
