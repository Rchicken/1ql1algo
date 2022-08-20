전체일자, 연속일자 = map(int, input().split())
누적합 = [0 for _ in range(전체일자+1)]

전체온도 = list(map(int, input().split()))

누적합[0] = 0
for i, 온도 in enumerate(전체온도, 1):
    누적합[i] += 온도 + 누적합[i - 1]

answer = -1e9
for i in range(연속일자, 전체일자+1):
    구간합 = 누적합[i] - 누적합[i-연속일자]
    answer = max(answer, 구간합)

print(answer)
