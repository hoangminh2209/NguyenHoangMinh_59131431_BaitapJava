/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Dell
 */
public class Context {
     private ITinhToan tinhpheptinh;

    public void setTinhpheptinh(ITinhToan tinhpheptinh) {
        this.tinhpheptinh = tinhpheptinh;
    }
    public float tinh(float a, float b)
    {
        return tinhpheptinh.tinh(a, b);
    }
}
