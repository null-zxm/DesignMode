package Builder_XML;

import java.util.ArrayList;
import java.util.List;

public class TagNode {
		private String tagName;
		private String tagValue;
		private List<TagNode> children=new ArrayList<TagNode>();
		private List<Attribute> attribute=new ArrayList<>();
		private static class Attribute{
			String name;
			String value;
		}
		private TagNode() {
		}
	public static class TagNodeBuilder{
		private String tagName;
		private String tagValue;
		private List<TagNode> children=new ArrayList<TagNode>();
		private List<Attribute> attribute=new ArrayList<>();
		public TagNodeBuilder tagName(String tagName){
			this.tagName=tagName;
			return this;
		}
		public TagNodeBuilder tagValue(String tagValue){
			this.tagValue=tagValue;
			return this;
		}
		public TagNodeBuilder addChildren(TagNode tagNode){
			this.children.add(tagNode);
			return this;
		}
		public TagNodeBuilder addAttribute(Attribute attribute){
			this.attribute.add(attribute);
			return this;
		}
		public TagNode builder(){
			TagNode tagNode=new TagNode();
			tagNode.attribute=this.attribute;
			tagNode.children=this.children;
			tagNode.tagName=this.tagName;
			tagNode.tagValue=this.tagValue;
			return tagNode;
		}
	}
}

