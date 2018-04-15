import java.util.ArrayList;

public class node {
    int cost;
    char name;
    ArrayList<node> visitkro=new ArrayList<>();

    public node()
    {
        cost=0;
    }
    public  node(node temp){
        cost=temp.cost;
        name=temp.name;
        visitkro=temp.visitkro;
    }
    public node(char name){
        cost=0;
        this.name=name;
    }

    public  void add( node x, int cost ){

        x.cost=cost;
        visitkro.add(new node(x));


    }


}
