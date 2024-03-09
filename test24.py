def decode(message_file):
    nums = []

    with open(message_file, "r") as file:
        for line in file:
            num, word = line.split()
            nums.append((int(num), word))

    nums.sort(key=lambda x: x[0])

    # get subsets
    step = 1
    subsets = []
    while len(nums) != 0:
        if len(nums) >= step:
            subsets.append(nums[0:step])
            nums = nums[step:]
            step += 1
        else:
            return False

    # get last word of each subset
    decoded_message = []
    for subset in subsets:
        decoded_message.append(subset[-1][1])

    return " ".join(decoded_message)


print(decode("coding_qual_input.txt"))

# Example usage:
# decoded_message = decode('your_file.txt')
# print(decoded_message)
