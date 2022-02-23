def lengthOfLongestSubstring(substring):
    """find the longest substring w/o repeats and return length
    i.e abcbca return 3, since abc is the longest
    or bbbb return 1 since b is the longest"""

    string_len = {}
    for i in range(len(substring)):
        if substring[i] not in string_len:
            string_len[substring[i]] = i    
        else:
            return string_len[substring[i]]



            
print(lengthOfLongestSubstring('abc'))