SRC = src/AdjacencyList.java \
	src/TopologicalSorting.java
CLASSES = $(SRC:.java=.class)

build: $(CLASSES)

$(CLASSES): $(SRC)
	javac $(SRC)

test: build
	java src.TopologicalSorting < graph/graph-100.alists
	java src.TopologicalSorting < graph/graph-101.alists
	java src.TopologicalSorting < graph/graph-102.alists
	java src.TopologicalSorting < graph/graph-103.alists
	java src.TopologicalSorting < graph/graph-104.alists
	java src.TopologicalSorting < graph/graph-105.alists
	java src.TopologicalSorting < graph/graph-106.alists
	java src.TopologicalSorting < graph/graph-107.alists

.PHONY: clean

clean:
	rm -fr src/$(CLASSES)
