import java.util.ArrayList;
import java.util.List;
import com.lc.nlp4han.constituent.TreeNode;

/**
 * 路径类
 * @author yzc
 *
 */
public class Path{
    private List<TreeNode> path;
    
    public Path() {
	path = new ArrayList<TreeNode>();
    }
    
    public TreeNode getFirstNode() {
	return path.get(0);
    }
    
    public TreeNode getLastNode() {
	return path.get(path.size()-1);
    }
    
    public List<TreeNode> getPathList() {
	return path;
    }
    
    public void addPathNode(TreeNode pathNode)
    {
	path.add(pathNode);
    }
    
    public TreeNode get(int index)
    {
	return path.get(index);
    }
    
    public boolean isEmpty() {
	return path.isEmpty();
    }
    
    public int size()
    {
	return path.size();
    }

    public static Path getPath(TreeNode startNode, TreeNode endNode) {
	// TODO Auto-generated method stub
	return null;
    }
}
