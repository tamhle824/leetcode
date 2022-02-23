

def twoSum(nums,target):
    d = {}
    for i in range(len(nums)):
        if nums[i] in d:
            if nums[i] in d:
                return [d[nums[i]],i]
        else:
            d[target-nums[i]] = i 
    

print(twoSum([2,1,3,4],6))
