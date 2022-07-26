# https://school.programmers.co.kr/learn/courses/30/lessons/17682?language=python3
import re

bonus = {'S':1, 'D':2, 'T':3} # 지수
option = {'#':-1, '*':2} # 곱셈
scores=[]

def calculate_dart(dart):
    number = int(re.findall('[0-9]+', dart)[0])
    
    for d in dart:
        if d in bonus:
            number = number ** bonus[d]
        if d == '*':
            if len(scores)==0:
                number *= 2
            else:
                scores[-1] *=2
                number *=2
        if d == '#':
            number *= -1
    return number
            
    
def solution(dartResult):
    answer = 0
    darts = re.findall('[0-9]+[S|D|T][#|*]*', dartResult)
    print(darts)
    for dart in darts:
        scores.append(calculate_dart(dart))
    
    for score in scores:
        answer += score
    
    return answer
