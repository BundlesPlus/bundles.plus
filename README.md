<h1>BundlesPlus</h1>

This project originated from [OSGi enRoute][enroute]. The goal of enRoute is to provide a simple developer onramp for those unfamiliar with OSGi. enRoute turned out to be an excellent testbed for exploring modularity. [ModularityPlus][modularity.plus] was created in June 2018 to promote the concepts of modularity, upon which much of OSGi is based. This project has the aim of promoting ModularityPlus concepts implemented as OSGi bundles.

The bundles in this repository comprise an API for an OSGi base profile which can be used by modular-conscious developers. Many of
these bundles had to be developed for OSGi enRoute because such bundles did not exist in any open source project. Others were developed because open source projects exist, but did not follow good Modularity practices, or tended to pull in too many transitive dependencies.
The BundlesPlus base profile establishes a runtime that contains a minimal set of services that can be used as a base for applications.

## Contributing

Want to help out? See [CONTRIBUTING.md](CONTRIBUTING.md) for information on building, testing and contributing changes.

## License

The contents of this repository are made available to the public under the terms of the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).
Bundles may depend on non Apache Licensed code.

[enroute]: http://enroute.osgi.org
[modularity.plus]: https://github.com/ModularityPlus


