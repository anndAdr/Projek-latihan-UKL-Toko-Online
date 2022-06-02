/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoonline;

/**
 *
 * @author Dhia Rahmah
 */
public class TokoOnline {
    public static void main(String[] args) {
Member member=new Member();
Karyawan karyawan= new Karyawan();
Laporan laporan= new Laporan ();
Transaksi transaksi=new Transaksi();
Barang barang=new Barang();
laporan.laporan (barang);
laporan.laporan(member);
laporan.laporan(transaksi, barang);
transaksi.prosesTransaksi(member, transaksi, barang);
laporan.laporan(transaksi,barang);
laporan.laporan(barang);
laporan.laporan(member);
    }
    
    
}
