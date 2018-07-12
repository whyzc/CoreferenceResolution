import java.util.List;

import com.lc.nlp4han.constituent.TreeNode;

public class HobbsImpl implements Hobbs {

    private TreeNode x;
    private Path path;

    public TreeNode hobbs(List<TreeNode> constituentTrees, TreeNode pronoun) {
	TreeNode tmp;
	TreeNode candidateNode;
	TreeNode latestTree;
	int index = 1;
	
	latestTree = constituentTrees.get(index);
	FeatureFilter filter = new FeatureFilter(pronoun);
	tmp = TreeNodeUtil.getFistNPNodeUp(pronoun);
	x = TreeNodeUtil.getFistNPNodeUp(tmp);
	path = Path.getPath(x, tmp);
	candidateNode = TreeNodeUtil.getNPNodeOnLeftOfPathWithFeatureFilter(x, path, filter);
	
	if (candidateNode != null && TreeNodeUtil.isExistedNPOrIPNode(candidateNode, x))
	{
	    return candidateNode;
	}
	while (index >= constituentTrees.size())
	{
	    if (x.getParent() == null)
	    {
		latestTree = constituentTrees.get(index);
		candidateNode = TreeNodeUtil.getNPNodeWithFeatureFilter(latestTree, filter);
		index++;
		if (candidateNode != null)
		    return candidateNode; 
	    }
	    else
	    {
		tmp = TreeNodeUtil.getFistNPOrIPNodeUp(x); 
		path = Path.getPath(x, tmp);
		x  = tmp;
		if (TreeNodeUtil.isNPNode(x) && !TreeNodeUtil.dominateNNode(x, path))
		    return x;
		candidateNode = TreeNodeUtil.getNPNodeOnLeftOfPathWithFeatureFilter(x, path, filter);
		if (candidateNode != null)
		    return candidateNode;
		if (TreeNodeUtil.isIPNode(x))
		{
		    candidateNode = TreeNodeUtil.getSpecialNPNodeOnRightOfPathWithFeatureFilter(x, path, filter);
		    if (candidateNode != null)
			    return candidateNode;
		}
	    }
	}
	return null;
    }
}
