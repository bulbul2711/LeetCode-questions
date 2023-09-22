<h2><a href="https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2828. Check if a String Is an Acronym of Words</a></h2><h3>Easy</h3><hr><div><p>Given an array of strings <code>words</code> and a string <code>s</code>, determine if <code>s</code> is an <strong>acronym</strong> of words.</p>

<p>The string <code>s</code> is considered an acronym of <code>words</code> if it can be formed by concatenating the <strong>first</strong> character of each string in <code>words</code> <strong>in order</strong>. For example, <code>"ab"</code> can be formed from <code>["apple", "banana"]</code>, but it can't be formed from <code>["bear", "aardvark"]</code>.</p>

<p>Return <code>true</code><em> if </em><code>s</code><em> is an acronym of </em><code>words</code><em>, and </em><code>false</code><em> otherwise. </em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["alice","bob","charlie"], s = "abc"
<strong>Output:</strong> true
<strong>Explanation:</strong> The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym. 
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["an","apple"], s = "a"
<strong>Output:</strong> false
<strong>Explanation:</strong> The first character in the words "an" and "apple" are 'a' and 'a', respectively. 
The acronym formed by concatenating these characters is "aa". 
Hence, s = "a" is not the acronym.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> words = ["never","gonna","give","up","on","you"], s = "ngguoy"
<strong>Output:</strong> true
<strong>Explanation: </strong>By concatenating the first character of the words in the array, we get the string "ngguoy". 
Hence, s = "ngguoy" is the acronym.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 100</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 10</code></li>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>words[i]</code> and <code>s</code> consist of lowercase English letters.</li>
</ul>
</div>