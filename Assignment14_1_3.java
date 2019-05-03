public class Assignment14_1_3
{
	public static boolean contains(String haystack, String needle)
	{
		if(haystack.length() < needle.length())
		{
			return false;
		}
		else
		{
			boolean Flagged=false;
			for(int i = 0; i < needle.length(); i++)
			{
				if(haystack.charAt(i) != needle.charAt(i))
					if((i + 1) == needle.length())
					{
						Flagged = false;
						break;
					}
					else
						break;
				else
					if((i + 1) == needle.length())
					{
						Flagged = true;
						break;
					}
					else
						continue;
			}
			char[] charStack = new char[(haystack.length()-1)];
			for(int j = 1; j < charStack .length; j++)
			{
				charStack[j - 1] = haystack.charAt(j);
			}
			String newHaystack = new String(charStack);
			if(Flagged == false)
				return contains(newHaystack, needle);
			else
				return true;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Java Programming contains ogr is "+contains("Java programming", "ogr"));
		System.out.println("Java Programming contains grammy is "+contains("Java programming", "grammy"));
		System.out.println("Java Programming contains mmings is "+contains("Java programming", "mmings"));
	}
}