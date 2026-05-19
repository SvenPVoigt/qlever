# QLever

[![Docker build](https://github.com/ad-freiburg/QLever/actions/workflows/docker-publish.yml/badge.svg)](https://github.com/ad-freiburg/QLever/actions/workflows/docker-publish.yml)
[![Native build](https://github.com/ad-freiburg/qlever/actions/workflows/native-build.yml/badge.svg)](https://github.com/ad-freiburg/qlever/actions/workflows/native-build.yml)
[![Format check](https://github.com/ad-freiburg/qlever/actions/workflows/format-check.yml/badge.svg)](https://github.com/ad-freiburg/qlever/actions/workflows/format-check.yml)
[![Test coverage](https://codecov.io/github/ad-freiburg/qlever/branch/master/graph/badge.svg?token=OHcEh02rW0)](https://codecov.io/github/ad-freiburg/qlever)

QLever (pronounced "Clever") is a graph database implementing the
[RDF](https://www.w3.org/TR/rdf11-concepts/) and
[SPARQL](https://www.w3.org/TR/sparql11-overview/) standards. QLever can
efficiently load and query very large datasets, even with hundreds of billions
of triples, on a single commodity PC or server. QLever outperforms other RDF/SPARQL
databases by [a large margin on most queries](https://qlever.dev/evaluation) in a
[resourceful manner](https://github.com/ad-freiburg/qlever/wiki/QLever-performance-evaluation-and-comparison-to-other-SPARQL-engines).

QLever implements the full SPARQL 1.1 standard, including federated queries,
named graphs, the Graph Store HTTP Protocol, and updates. On top of its
outstanding performance, QLever offers a variety of unique features:
materialized views, advanced text-search capabilities, context-sensitive
autocompletion of SPARQL queries, live query analysis, efficient spatial
queries, and the interactive visualization of very large numbers of geometric
objects on a map. QLever can also be used as an embedded database, that is,
without the standard client-server setup but running in-process inside your
own C++ code.

[Here are demos of QLever](http://qlever.dev/) on a variety of
large datasets, including the complete Wikidata, Wikimedia Commons,
OpenStreetMap, UniProt, PubChem, and DBLP. The largest dataset has over one
trillion triples and runs on a single PC. The demos also feature QLever's
context-sensitive autocompletion, which makes SPARQL query construction so much
easier. The datasets are updated regularly. Click on "Index Information" for a
short description (with dates) and basic statistics.

If you use QLever in your research work, please cite one of the following publications:
our [CIKM'17 paper](https://ad-publications.informatik.uni-freiburg.de/CIKM_qlever_BB_2017.pdf) (QLever's beginning, combination of SPARQL and text search),
our [CIKM'22 paper](https://ad-publications.cs.uni-freiburg.de/CIKM_sparql_autocompletion_BKKKS_2022.pdf) (QLever's autocompletion, with an extensive evaluation),
our [2023 book chapter](https://ad-publications.cs.uni-freiburg.de/CHAPTER_knowledge_graphs_BKKK_2023.pdf) (survey of knowledge graphs and basics of QLever, with many example queries),
our [TGDK'24 article](https://drops.dagstuhl.de/entities/document/10.4230/TGDK.2.2.3) (the dblp knowledge graph and SPARQL endpoint),
our [SIGSPATIAL'25
paper](https://ad-publications.cs.uni-freiburg.de/SIGSPATIAL_spatialjoin_BBK_2025.pdf)
(efficient spatial joins, with a performance evaluation against PostgreSQL+PostGIS),
our [ISWC'25 GRASP paper](https://ad-publications.cs.uni-freiburg.de/ISWC_grasp_WB_2025.pdf) (zero-shot question answering on RDF graphs),
and our [ISWC'25 Sparqloscope paper](https://ad-publications.cs.uni-freiburg.de/ISWC_sparqloscope_BKTU_2025.pdf)
(a comprehensive SPARQL benchmark with a performance comparison of QLever and
several other RDF databases).

QLever is open source under the permissive Apache 2.0 license. QLever is in
active and rapid development. If you find a bug or if you are missing a feature
or if there is anything else you want to tell us, please [open an
issue](https://github.com/ad-freiburg/qlever/issues) or [open a
discussion](https://github.com/ad-freiburg/qlever/discussions).

# Quickstart and documentation

To get started with QLever, use our native packages released for [Debian, Ubuntu](https://docs.qlever.dev/quickstart/#debian-and-ubuntu) and [macOS](https://docs.qlever.dev/quickstart/#macos-apple-silicon). Additionally, a platform-independent version of QLever is available as an [image for Docker and Podman](https://hub.docker.com/r/adfreiburg/qlever). Whether you use the native packages or the Docker/Podman image, everything related to QLever can be controlled via a single command-line tool `qlever`. Please refer to our [Quickstart documentation](https://docs.qlever.dev/quickstart/) for details.

For the official documentation, see [docs.qlever.dev](https://docs.qlever.dev/). Additional
information (though potentially outdated) can be found on the [QLever Wiki](https://github.com/ad-freiburg/qlever/wiki).











# Sven's instructions


## Github instructions

1. Make a new branch from syntax-extension and figure out what to do with conflicting files
    * `git checkout syntax-extension`
    * `get checkout -b syntax-extension-update`

2. Merge origin/master
    * `git merge origin/master`




## Code updates

1. Copy the Docker file, change to an appropriate number of processors, and add xz.
    * `cp Dockerfile Dockerfile.local`
    * `cmake --build .` to `cmake --build . -- -j12`
    * 




## Build the database

1. Build image
    * `sudo docker build -f Dockerfile.local -t qlever-update .`

2. Get the data as nt format and get a QleverFile
    * to get nt format any code will do. I use RDFlib in python
    * QleverFile examples at [qlever-dev:qlever-control/src/qlever/Qleverfiles](https://github.com/qlever-dev/qlever-control/tree/main/src/qlever/Qleverfiles)
    * Add `ADD_HAS_WORD_TRIPLES = true` to the `[index]` section of the Qleverfile

3. Use the build to make an index
    * Set stxxl to a large number for large indices
    * `docker run -it --rm --user $(id -u):$(id -g) -v ./pubmed_db:/data -w /data --entrypoint bash qlever-update -c "qlever index"`
    
4. Start the server
    * `docker run -d --rm -p 7001:7001 --user $(id -u):$(id -g) -v ./pubmed_db:/data -w /data --entrypoint bash qlever-update -c "qlever start && tail -f /dev/null"`
    * `docker run -d --rm -p 7001:7001 --user $(id -u):$(id -g) -v ./pubmed_db:/data -w /data --entrypoint bash qlever-update -c "qlever start --run-in-foreground"`

5. start the UI for testing
    * `docker run -d -p 8176:7000 --name qui docker.io/adfreiburg/qlever-ui`

6. Set the UI to point to url set in the Qleverfile
    * `docker exec -it qui bash -c "python manage.py configure default http://localhost:7001"`




## Miscellaneous and possibly outdated dev things

1. Running an interactive instance
    * `docker run --rm -it --name qlever-dev-env -v "$(pwd)":/qlever qlever-dev bash`
2. Make without tests
    * `cmake --build . --target IndexBuilderMain ServerMain -- -j12`
3. Run tests
    * `ctest --output-on-failure -R propertyPaths`

