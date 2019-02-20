<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>点数計算</title>
</head>
<body>
	<div class="formcss">
		<form action="/portfolio_1/TesterServlet" method="post">
			<select name="oyako">
				<option value="1">親</option>
				<option value="2">子</option>
			</select> 符<input type="text" name="fu" class="demo2_1"><br> 翻<input
				type="text" name="han" class="demo2_2"><br> <input
				type="submit" value="計算開始">
		</form>
	</div>
	<table border=1>
		<tr>
			<td valign="top">
				<!-- 符のテーブル-->
				<table class="brwsr2">
					<tbody>
						<tr>
							<th>基本符</th>
							<td class="data fst">20符</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						</tr>
						<tr>
							<th>上がり方</th>
							<td class="data fst">ロン(10符)</td>
							<td class="data">ツモ(2符)</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						</tr>
						<tr>
							<th>各メンツ</th>
							<td class="data fst">順子(0符)</td>
							<td class="data">2~8<br>刻子<br>槓子
							</td>
							<td class="data">明刻(2符)<br>暗刻(4符)<br>明積(8符)<br>暗積(16符)
							</td>
							<td class="data">1・9・字牌<br>刻子<br>積子
							</td>
							<td class="data">明刻(4符)<br>暗刻(8符)<br>明積(16符)<br>暗積(32符)
							</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						</tr>
						<tr>
							<th>アタマ</th>
							<td class="data fst">2符<br>役牌
							</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						</tr>
						<tr>
							<th>待ちの形</th>
							<td class="data fst">2符<br>ペンチャン・カンチャン・単騎・ノベタン
							</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
						</tr>
					</tbody>
				</table>
				<p class="coment">
					※ピンフツモは一律20符。七対子は一律25符<br>符は1の位を繰り上げる。
				</p>
			</td>

			<td valign="top">
				<!-- 翻のテーブル -->
				<table class="brwsr2">
					<tbody>
						<tr>
							<th>1翻役</th>
							<th>2翻役</th>
							<th>3翻役</th>
							<th>4翻役</th>
							<th>6翻役</th>
							<th>13翻役</th>
						</tr>
						<tr>
							<td class="data">役牌</td>
							<td class="data">対々和</td>
							<td class="data">混一色</td>
							<td class="data">小三元</td>
							<td class="data">清一色</td>
							<td class="data">四暗刻</td>
						</tr>
						<tr>
							<td class="data">平和</td>
							<td class="data">三色同順</td>
							<td class="data">純チャン</td>
							<td class="data">混老頭</td>
							<td class="data">人和</td>
							<td class="data">四槓子</td>
						</tr>
						<tr>
							<td class="data">立直</td>
							<td class="data">七対子</td>
							<td class="data">二盃口</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">大三元</td>
						</tr>
						<tr>
							<td class="data">ツモ</td>
							<td class="data">タンヤオ</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">国士無双</td>
						</tr>
						<tr>
							<td class="data">タンヤオ</td>
							<td class="data">チャンタ</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">天和</td>
						</tr>
						<tr>
							<td class="data">一発</td>
							<td class="data">三色同刻</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">地和</td>
						</tr>
						<tr>
							<td class="data">一盃口</td>
							<td class="data">三槓子</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">四喜和</td>
						</tr>
						<tr>
							<td class="data">ハイテイ</td>
							<td class="data">ダブリー</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">字一色</td>
						</tr>
						<tr>
							<td class="data">嶺上開花</td>
							<td class="data">一気通貫</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">清老頭</td>
						</tr>
						<tr>
							<td class="data">槍槓</td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">緑一色</td>
						</tr>
						<tr>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data"></td>
							<td class="data">九連宝燈</td>
						</tr>
					</tbody>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>