# https://school.programmers.co.kr/learn/courses/30/lessons/17681
def convert(x):
    if x == "1":
        return "#"
    else:
        return " "

def solution(n, arr1, arr2):
    answer = []
    for a1, a2 in zip(arr1, arr2):
        converted_map = list(map(convert, str(format(a1|a2, 'b'))))
        
        while len(converted_map) < n:
            converted_map.insert(0,' ')
            
        answer.append("".join(converted_map))
    
    return answer
