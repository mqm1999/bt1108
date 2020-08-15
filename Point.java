/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

/**
 *
 * @author HP Pavilion
 */
public class Point {

    int x_axis, y_axis, z_axis;

    public Point() {

    }

    public Point(int x_axis, int y_axis, int z_axis) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.z_axis = z_axis;
    }

    public int getX_axis() {
        return x_axis;
    }

    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }

    public int getZ_axis() {
        return z_axis;
    }

    public void setZ_axis(int z_axis) {
        this.z_axis = z_axis;
    }

    public void show() {
        System.out.println(x_axis + "," + y_axis + "," + z_axis);
    }

}
