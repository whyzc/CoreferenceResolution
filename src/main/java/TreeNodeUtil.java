import com.lc.nlp4han.constituent.TreeNode;

public class TreeNodeUtil {
    /**
     * 在根结点treeNode下，路径path左侧，从左至右，广度遍历，获取第一个能通过特征过滤器filter过滤的NP或IP结点
     * @param treeNode 根结点
     * @param path 规定路径
     * @param filter 特征过滤器
     * @return 若存在，返回符合的NP或IP结点；若不存在，则返回null
     */
    public static TreeNode getNPOrIPNodeOnLeftOfPathWithFeatureFilter(TreeNode treeNode, Path path, FeatureFilter filter)
    {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * 从treeNode开始，向上遍历，找到第一个NP结点
     * @param treeNode
     * @return 若存在，返回符合的NP结点；若不存在，则返回null
     */
    public static TreeNode getFistNPNodeUp(TreeNode treeNode) {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * 在根结点treeNode下，路径path左侧，从左至右，广度遍历，获取第一个能通过特征过滤器filter过滤的NP结点
     * @param treeNode 根结点
     * @param path 规定路径
     * @param filter 特征过滤器
     * @return 若存在，返回符合的NP结点；若不存在，则返回null
     */
    public static TreeNode getNPNodeOnLeftOfPathWithFeatureFilter(TreeNode treeNode, Path path, FeatureFilter filter) {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * 在结点sonNode和其祖先结点ancestorNode之间，是否存在NP或IP结点
     * @param sonNode 孙子结点
     * @param ancestorNode 祖先结点
     * @return 若存在NP或IP结点，返回true；否则，返回false
     */
    public static boolean isExistedNPOrIPNode(TreeNode sonNode, TreeNode ancestorNode) {
	// TODO Auto-generated method stub
	return false;
    }

    /**
     * 在根结点treeNode下，从左至右，广度遍历，获取第一个能通过特征过滤器filter过滤的NP结点
     * @param treeNode 根结点
     * @param filter 特征过滤器
     * @return 若存在，返回符合的NP结点；若不存在，则返回null
     */
    public static TreeNode getNPNodeWithFeatureFilter(TreeNode treeNode, FeatureFilter filter) {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * 从treeNode开始，向上遍历，找到第一个NP或IP结点
     * @param treeNode
     * @return 若存在，返回符合的NP结点；若不存在，则返回null
     */
    public static TreeNode getFistNPOrIPNodeUp(TreeNode treeNode) {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * 结点treeNode是否为NP结点
     * @param treeNode 被验证的结点
     * @return 若存在，若该节点是NP结点，返回true；否则，返回false
     */
    public static boolean isNPNode(TreeNode treeNode) {
	// TODO Auto-generated method stub
	return false;
    }

    /**
     * 路径path是否穿过结点treeNode直接支配的一个Nominal结点
     * @param treeNode 
     * @param path
     * @return 若路径path穿过结点，返回true；否则，返回false
     */
    public static boolean dominateNNode(TreeNode treeNode, Path path) {
	// TODO Auto-generated method stub
	return false;
    }

    /**
     * 结点treeNode是否为IP结点
     * @param treeNode 被验证的结点
     * @return 若该节点是IP结点，返回true；否则，返回false
     */
    public static boolean isIPNode(TreeNode treeNode) {
	// TODO Auto-generated method stub
	return false;
    }

    /**
     * 在根结点treeNode下，路径path右侧，从左至右，广度遍历，
     * 获取一个能通过特征过滤器filter过滤的NP结点，该过程不搜索遇到的任何NP或IP结点之下的分支
     * @param treeNode 根结点
     * @param path 规定路径
     * @param filter 特征过滤器
     * @return 若存在，返回符合的NP结点；若不存在，则返回null
     */
    public static TreeNode getSpecialNPNodeOnRightOfPathWithFeatureFilter(TreeNode treeNode, Path path, FeatureFilter filter) {
	// TODO Auto-generated method stub
	return null;
    }
}
