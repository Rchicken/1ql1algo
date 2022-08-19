# 1655 가운데를 말해요
# https://www.acmicpc.net/problem/1655
'''
백준이가 정수를 하나씩 외칠때마다 
동생은 지금까지 백준이가 말한 수 중에서 중간값을 말해야 한다
외친 수의 개수가 짝수개라면 중간에 있는 두 수 중에서 작은 수
'''
import heapq
import sys

왼쪽힙 = []
오른힙 = []

백준이 = int(sys.stdin.readline())

# 1 중앙값 설정
중앙값 = int(sys.stdin.readline())
print(중앙값)

for i in range(백준이-1):
    # 2 새로들어온 값 - 중앙값과 비교
    new_num = int(sys.stdin.readline())
    # 3 적절한 힙에 삽입
    if new_num <= 중앙값:
        heapq.heappush(왼쪽힙,(-new_num,new_num))
    elif new_num > 중앙값:
        heapq.heappush(오른힙,(new_num, new_num))

    # 좌우 균형 맞추기 및 중앙값 갱신
    if (len(왼쪽힙)+len(오른힙)+1)%2==0: 
        if len(왼쪽힙)+1 == len(오른힙):
            pass
        elif len(왼쪽힙) > len(오른힙)-1:
            변경할중앙값 = heapq.heappop(왼쪽힙)[1]
            heapq.heappush(오른힙,(중앙값,중앙값))
            중앙값 = 변경할중앙값
        elif len(왼쪽힙) < len(오른힙)-1:
            변경할중앙값 = heapq.heappop(오른힙)[1]
            heapq.heappush(왼쪽힙,(-중앙값,중앙값))
            중앙값 = 변경할중앙값
        else:
            pass

    else:
        if len(왼쪽힙) == len(오른힙):
            pass
        elif len(왼쪽힙) > len(오른힙):
            변경할중앙값 = heapq.heappop(왼쪽힙)[1]
            heapq.heappush(오른힙,(중앙값,중앙값))
            중앙값 = 변경할중앙값
        elif len(왼쪽힙) < len(오른힙):
            변경할중앙값 = heapq.heappop(오른힙)[1]
            heapq.heappush(왼쪽힙,(-중앙값,중앙값))
            중앙값 = 변경할중앙값
    print(중앙값)
