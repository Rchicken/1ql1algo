'''
https://school.programmers.co.kr/learn/courses/30/lessons/118666
1. 성격 유형 검사하기
(R,T), (C,F), (J,M), (A,N)
MBTI - 총 16가지

N개의 질문 (10^3)
0,1,2 - s[0]
4,5,6 - s[1]
7개의 선택지- 3 2 1 0 1 2 3
'''
def calculate_mbti(mbti):
    answer = ''
    print(mbti)
    
    value = 'R' if mbti['R'] >= mbti['T'] else 'T'
    answer+=value
    value = 'C' if mbti['C'] >= mbti['F'] else 'F'
    answer+=value
    value = 'J' if mbti['J'] >= mbti['M'] else 'M'
    answer+=value
    value = 'A' if mbti['A'] >= mbti['N'] else 'N'
    answer+=value
    
    return answer

def solution(survey, choices):
    MBTI = dict(R=0,T=0,C=0,F=0,J=0,M=0,A=0,N=0)
    점수 = {0:3, 1:2, 2:1, 3:0, 4:1, 5:2, 6:3}
    비동의 = set([0,1,2])
    
    for s , c in zip(survey,choices):
        c = c-1
        if c in 비동의:
            MBTI[s[0]] += 점수[c]
        else:
            MBTI[s[1]] += 점수[c]
    return calculate_mbti(MBTI)
    
