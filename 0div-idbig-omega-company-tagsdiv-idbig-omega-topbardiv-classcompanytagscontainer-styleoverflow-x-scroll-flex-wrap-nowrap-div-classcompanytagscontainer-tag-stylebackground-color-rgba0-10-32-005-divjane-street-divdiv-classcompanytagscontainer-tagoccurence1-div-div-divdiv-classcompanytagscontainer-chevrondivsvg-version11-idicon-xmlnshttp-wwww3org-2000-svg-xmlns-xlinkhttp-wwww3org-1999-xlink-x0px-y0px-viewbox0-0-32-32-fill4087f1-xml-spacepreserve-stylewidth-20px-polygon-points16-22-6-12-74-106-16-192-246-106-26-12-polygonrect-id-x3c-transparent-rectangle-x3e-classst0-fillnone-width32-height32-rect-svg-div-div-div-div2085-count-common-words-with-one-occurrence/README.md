<h2><a href="https://leetcode.com/problems/count-common-words-with-one-occurrence/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Jane Street</div><div class="companyTagsContainer--tagOccurence">1</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2085. Count Common Words With One Occurrence</a></h2><h3>Easy</h3><hr><div><p>Given two string arrays <code>words1</code> and <code>words2</code>, return <em>the number of strings that appear <strong>exactly once</strong> in <b>each</b>&nbsp;of the two arrays.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
- "leetcode" appears exactly once in each of the two arrays. We count this string.
- "amazing" appears exactly once in each of the two arrays. We count this string.
- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
- "as" appears once in words1, but does not appear in words2. We do not count this string.
Thus, there are 2 strings that appear exactly once in each of the two arrays.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no strings that appear in each of the two arrays.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> words1 = ["a","ab"], words2 = ["a","a","a","ab"]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The only string that appears exactly once in each of the two arrays is "ab".
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words1.length, words2.length &lt;= 1000</code></li>
	<li><code>1 &lt;= words1[i].length, words2[j].length &lt;= 30</code></li>
	<li><code>words1[i]</code> and <code>words2[j]</code> consists only of lowercase English letters.</li>
</ul>
</div>