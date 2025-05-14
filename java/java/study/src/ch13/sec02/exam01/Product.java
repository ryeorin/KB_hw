package ch13.sec02.exam01;

public class Product<k,m> {
    private k kind;
    private m model;

    //메소드
    public k getKind() {return this.kind;}
    public m getModel() {return this.model;}
    public void setKind(k kind) {this.kind = kind;}
    public void setModel(m model) {this.model = model;}

}
