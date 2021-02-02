public class Order{
  private int table;
  private Product product;
  private boolean complete;

  public Order(int x, Product y){
     this.table = x;
     this.product =y;

  }
 public int getTable(){
   return table;
 }
public Product getProduct(){
  return product;
}
public void setproduct(Product y){
  this.product = y;
}
public boolean isComplete(){
  return complete;
}
public void setComplete(boolean c){
  this.complete = c;
}
public String toString(){
  String ch = " ";
  if(this.complete==true)
    ch ="/";
    return product.getName()+ " ["+ ch+ "]";
  }

}
