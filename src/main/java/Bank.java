public class Bank {
    private int saldo;

    public Bank (int saldo){
        this.saldo = saldo;
    }

    public void simpanUang (int jumlah){
        saldo += jumlah;
    }

    public void ambilUang (int jumlah){
        saldo -= jumlah;
    }

    public int getSaldo(){
        return saldo;
    }
}
