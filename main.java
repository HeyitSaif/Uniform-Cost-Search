import java.util.ArrayList;

public class main {

    static int weight=0,smallest=999999;  //largest values near to infinity will save the shortest path
    public static node s=new node('s');
    public static node a=new node('a'); //all the name of node
    public static node b=new node('b');
    public static node c=new node('c');
    public static node d=new node('d');
    public static node e=new node('e');
    public static node g=new node('g');
    public static node startnode=new node();
    public static node endnode=new node();

    static ArrayList<node> smallestarray=new ArrayList<>();
    static ArrayList<node> visitkrchuka=new ArrayList<>();      // will have the lo

    public static void main(String[] args) {

        s.add(a,3);
        s.add(b,1);
        s.add(c,8);
        a.add(d,3);
        a.add(e,7);
        a.add(g,15);
        b.add(g,20);
        c.add(g,5);
        endnode=g;
        startnode=s;
        visitkrchuka.add(startnode);
        for (int i=0;i<startnode.visitkro.size();i++){

            explore(startnode.visitkro.get(i));


        }

        for (int j=0;j<smallestarray.size();j++)
            System.out.println("smallest Array : "+smallestarray.get(j).name);
        System.out.println("cost : "+smallest);

    }

    public static void explore(node temp){

        visitkrchuka.add(temp);
        weight += temp.cost;
        if (!temp.visitkro.isEmpty()) {
            for (int i = 0; i < temp.visitkro.size(); i++) {
                explore(temp.visitkro.get(i));
            }
            weight-=temp.cost;

            visitkrchuka.remove(temp);
        }
        else
        {
            if (temp.name=='g') {
                if (smallest > weight) {
                    smallest = weight;

                    smallestarray = (ArrayList<node>) visitkrchuka.clone();
                    weight-=temp.cost;
                    visitkrchuka.remove(temp);
                }
                else{
                    weight-=temp.cost;
                    visitkrchuka.remove(temp);
                }
            }
            else{
                weight -= temp.cost;
                visitkrchuka.remove(temp);
            }


        }
    }
}

