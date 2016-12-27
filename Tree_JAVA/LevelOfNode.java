/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class GetLevelNode
{
    void getLevel(Node r , int data)
    {
        for(int i=1; i <= height(r); i++)
        {
            //System.out.println(height(r));
            checkLevel(r, i, i, data);
        }
    }

    private int height(Node r)
    {
        int l=0,rt=0;
        if(r == null)
            return 0;

        l = height(r.left);
        rt = height(r.right);
        if(l > rt)
            return l+1;
        else
            return rt+1;
    }

    private void checkLevel(Node r, int i, int level, int data)
    {
        if(r == null)
            return;
        if(i == 1)
        {
            if(r.data == data)
            {
                System.out.println(level);
            }
        }
        else if(i == 0)
            return;

        checkLevel(r.left, i-1, level, data);
        checkLevel(r.right, i-1, level, data);
    }
}

public class LevelOfNode
{
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new GetLevelNode().getLevel(root, 70);
    }

}
