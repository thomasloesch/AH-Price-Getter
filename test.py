import requests, sys

endPoint = "https://us.api.battle.net/wow/auction/data/stormrage?locale=en_US&apikey=" + sys.argv[1]

r = requests.get(endPoint)

for s in r:
	print(s)

