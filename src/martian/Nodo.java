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
    int g_;
    int h_;
    int f_; //f=g+h
    int x_,y_;
    boolean isVisited_;

    public Nodo(int f,int c) {
        x_=f;
        y_=c;
        g_=0;
        h_=0;
        f_=g_+h_;
        isVisited_=false;
    }
    public int get_x() {
        return x_;
    }
    public int get_y() {
        return y_;
    }
    public boolean get_isVisited() {
        return isVisited_;
    }
    public int get_cost() {
        return f_;
    }
    public void set_g(boolean horizontal) {
        if (horizontal == true)
            g_=costoLateral_;
        else
            g_=costoDiagonal_;
    }
    public void set_h() {
        h_=Manhattan(x_, y_);
    }
    public void set_f() {
        f_=g_+h_;
    }
     public int Manhattan(int x, int y) {
        return Math.abs(x_-x)*costoLateral_ + Math.abs(y_-y_)*costoLateral_;
    }
}
