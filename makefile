SRC = src/Graph.java \
	src/MyStack.java \
	src/TopologicalSorting.java \
	src/Vertex.java
CLASSES = $(SRC:.java=.class)
AUTO_GEN_CLASSES = src/Vertex\$$Color.class

build: $(CLASSES)

$(CLASSES): $(SRC)
	javac $(SRC)

test0: build
	java src.TopologicalSorting < graph/graph-100.alists

test1: build
	java src.TopologicalSorting < graph/graph-101.alists

test2: build
	java src.TopologicalSorting < graph/graph-102.alists

test3: build
	java src.TopologicalSorting < graph/graph-103.alists

test4: build
	java src.TopologicalSorting < graph/graph-104.alists

test5: build
	java src.TopologicalSorting < graph/graph-105.alists

test6: build
	java src.TopologicalSorting < graph/graph-106.alists

test7: build
	java src.TopologicalSorting < graph/graph-107.alists

testRandom: build
	java -jar graph/randomdag.jar 100 0.3 | java src.TopologicalSorting

testAll: test0 test1 test2 test3 test4 test5 test6 test7 testRandom

.PHONY: clean help

clean:
	rm -fr $(CLASSES) $(AUTO_GEN_CLASSES)

help:
	@echo "make build      <> Compile les sources"
	@echo "make clean      <> Supprimme les fichiers compilés"
	@echo "make help       <> Affiche cette aide"
	@echo "make testAll    <> Lance tous les tests ci-dessous"
	@echo "make test0      <> Test le graphe 100"
	@echo "make test1      <> Test le graphe 101"
	@echo "make test2      <> Test le graphe 102"
	@echo "make test3      <> Test le graphe 103"
	@echo "make test4      <> Test le graphe 104"
	@echo "make test5      <> Test le graphe 105"
	@echo "make test6      <> Test le graphe 106"
	@echo "make test7      <> Test le graphe 107"
	@echo "make testRandom <> Test un graphe de 100 sommets avec une probabilité d'arc qui est de 0.3"
