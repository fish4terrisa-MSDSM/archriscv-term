all: help_page

help_page: css/pandoc.css help.md.in
	rm ../archriscv-app/app/src/main/assets/help/help.html
	pandoc --self-contained --css css/pandoc.css --from=markdown --to=html --output help.html help.md.in
	mv help.html ../archriscv-app/app/src/main/assets/help/help.html
