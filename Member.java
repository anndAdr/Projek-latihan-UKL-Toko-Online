/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoonline;

import java.util.ArrayList;

public class Member implements User {

    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        this.namaMember.add("aulia Baik Hati");
        this.alamat.add("Malang");
        this.telepon.add("723300");
        this.saldo.add(500000);

        this.namaMember.add("Devi juga baik");
        this.alamat.add("Tulungagung");
        this.telepon.add("0341");
        this.saldo.add(250000);

        this.namaMember.add("Syaiful juga ganteng");
        this.alamat.add("Blitar");
        this.telepon.add("099099");
        this.saldo.add(2500000);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }
    // untuk perubahan saldo member

    public void editSaldo(int idMember, int saldo) {
        this.saldo.set(idMember, saldo);;
    }

    //untuk mengetahui jumlah data arraylist nama member
    public int getJmlMember() {
        return this.namaMember.size();

    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);

    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);

    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);

    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    void editsaldo(int idMember, int saldo) {
       this.saldo.set(idMember,saldo);
    }
}
