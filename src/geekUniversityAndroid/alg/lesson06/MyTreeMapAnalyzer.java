package geekUniversityAndroid.alg.lesson06;

import java.util.*;

public class MyTreeMapAnalyzer {

    private SortedMap<Integer,List> listDepthNode =  new TreeMap();
    private MyTreeMap.Node node;



    public MyTreeMapAnalyzer(MyTreeMap<Integer, String> map) {
        this.node = map.getRootNode();
        int depth = 0;
        addNodeDepth(this.node, "root", this.node.key, depth);

        clearNull();

    }

    private void clearNull() {
        List<NodeD> listNode  = listDepthNode.get(listDepthNode.size()-1);
        if (getListNodeSize(listNode) == 0) {
            listDepthNode.remove(listDepthNode.size()-1);
        }
    }

    private<Key extends Comparable<Key>> void addNodeDepth(MyTreeMap.Node node, String prefix, Key key, int depth) {
        add(depth,node,prefix,key.toString());
        if (node == null) {
            return;
        }
        addNodeDepth(node.left, "/", node.key, depth+1);
        addNodeDepth(node.right, "\\", node.key, depth+1);

    }
    public <Key extends Comparable<Key>, Value> void add(int depth, MyTreeMap<Key,Value>.Node node, String prefix, String keyParent) {

        NodeD nodeD = new NodeD();
        if (node != null) {
            nodeD.setKey(node.key.toString());
            nodeD.setValue(node.value.toString());
            nodeD.depthNode = node.depth;
        }

        nodeD.setDepth(depth);
        nodeD.setPrefix(prefix);
        nodeD.setKeyParent(keyParent);


        if (listDepthNode.containsKey(depth)) {
            listDepthNode.get(depth).add(nodeD);

        }else {
            List<NodeD> listNode = new ArrayList();
            listNode.add(nodeD);
            listDepthNode.put(depth,listNode);

        }
    }

    public void print() {


        System.out.println(" --- Index Tree ---");
        Iterator iterator = listDepthNode.keySet().iterator();
        while(iterator.hasNext()) {
            int key = (int) iterator.next();
            List<NodeD> listNode  = listDepthNode.get(key);
            //System.out.println("key="+key+" size = "+listNode.size());


            if (getListNodeSize(listNode) == 0){
                break;
            }
            System.out.printf("%s Lvl ----- size = %s  \n",key, getListNodeSize(listNode));

            for (int i = 0; i < listNode.size(); i++) {
                NodeD nodeD = listNode.get(i);
                if (nodeD.prefix.equals("/")) {
                    System.out.printf(" %s <-%s [%s] ",nodeD.key,nodeD.prefix, nodeD.keyParent);
                }
                if (nodeD.prefix.equals("\\")) {
                    System.out.printf("[%s] %s-> %s  ", nodeD.keyParent,nodeD.prefix,nodeD.key);
                }

                if (nodeD.prefix.equals("root")) {
                    System.out.printf("%s  [%s] ", nodeD.prefix,nodeD.key);
                }

            }
            System.out.println();
        }
    }

    private int getListNodeSize(List<NodeD> listNode) {
        int size = 0;
        for (int i = 0; i < listNode.size(); i++) {

            if (!listNode.get(i).getKey().equals("null")) {
                size++;
            }
        }
        return size;
    }

    public boolean isBalance(){

        int max = 0;
        Iterator iterator = listDepthNode.keySet().iterator();
        while(iterator.hasNext()) {
            int key = (int) iterator.next();
            List<NodeD> listNode  = listDepthNode.get(key);

            if (getListNodeSize(listNode) == 0){
                break;
            }
            max = Math.max(max,getListNodeSize(listNode));
            System.out.printf("[%d] size = %d \n",listDepthNode.size()-key-1, getListNodeSize(listNode));


        }

        return false;
    }

    class NodeD{
        int depthNode;
        int depth;
        String prefix;
        String keyParent;
        String key = "null";
        String Value = "null";

        public int getDepth() {
            return depth;
        }

        public void setDepth(int depth) {
            this.depth = depth;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return Value;
        }

        public void setValue(String value) {
            Value = value;
        }

        public String getKeyParent() {
            return keyParent;
        }

        public void setKeyParent(String keyParent) {
            this.keyParent = keyParent;
        }
    }
}
