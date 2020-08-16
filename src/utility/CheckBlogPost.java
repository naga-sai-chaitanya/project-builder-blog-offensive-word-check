package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	String[] offensive_words= {"2 girls 1 cup",
	                          "2g1c",
	                          "4r5e",
	                          "5h1t",
	                         " 5hit",
	                          "a$$",
	                          "a$$hole",
	                          "a_s_s",
	                         " a2m",
	                         " a54",
	                          "a55",
	                          "a55hole",
	                         " acrotomophilia",
	                          "aeolus",
	                         " ahole",
	                         " alabama hot pocket",
	                          "alaskan pipeline",
	                          "anal",
	                         " anal impaler",
	                          "anal leakage",
	                          "analprobe",
	                          "anilingus",
	                          "anus",
	                         " apeshit",
	                          "ar5e",
	                          "areola",
	                         " areole",
	                         " arian",
	                        "  arrse",
	                          "arse",
	                         " arsehole",
	                         " aryan",
	                         " ass",
	                         " ass" ,"fuck"};
	
	public boolean checkBlog(Blog blog)
	{
		if(checkBlogTitle(blog) && checkBlogDescription(blog))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean checkBlogTitle(Blog blog) {
		String title=blog.getBlogTitle();
		for(int i=0;i<offensive_words.length;i++)
		{
			if(offensive_words[i].equals(title))
			{
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String description=blog.getBlogDescription();
		for(int i=0;i<offensive_words.length;i++)
		{
			if(offensive_words[i].equals(description))
			{
				return false;
			}
		}
		return true;
	}
}

