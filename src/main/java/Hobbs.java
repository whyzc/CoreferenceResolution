import java.util.List;
import com.lc.nlp4han.constituent.TreeNode;

public interface Hobbs {
    public TreeNode hobbs(List<TreeNode> consitituentTrees, TreeNode pronoun);
}
