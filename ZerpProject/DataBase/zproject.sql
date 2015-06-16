-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 16 Juin 2015 à 14:44
-- Version du serveur :  5.6.21
-- Version de PHP :  5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `zproject`
--

-- --------------------------------------------------------

--
-- Structure de la table `composet_componet`
--

CREATE TABLE IF NOT EXISTS `composet_componet` (
`id_composet_componet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `form_container_object`
--

CREATE TABLE IF NOT EXISTS `form_container_object` (
`id_form_container_object` int(11) NOT NULL,
  `menu` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `form_container_object`
--

INSERT INTO `form_container_object` (`id_form_container_object`, `menu`) VALUES
(4, 0);

-- --------------------------------------------------------

--
-- Structure de la table `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
`id_menu` int(11) NOT NULL,
  `id_super_menu` int(11) NOT NULL,
  `id_project` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `menu`
--

INSERT INTO `menu` (`id_menu`, `id_super_menu`, `id_project`) VALUES
(4, 0, 3),
(5, 1, 3);

-- --------------------------------------------------------

--
-- Structure de la table `relation_container_object`
--

CREATE TABLE IF NOT EXISTS `relation_container_object` (
`relation_container_object` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `simple_component`
--

CREATE TABLE IF NOT EXISTS `simple_component` (
`id_simple_component` int(11) NOT NULL,
  `simpl_comp_name` varchar(40) NOT NULL,
  `simpl_comp_value` varchar(200) NOT NULL,
  `simpl_comp_placeholder` varchar(200) NOT NULL,
  `simpl_comp_size` int(3) NOT NULL,
  `simpl_comp_formvisibility` int(1) NOT NULL,
  `simpl_comp_treevisibility` int(1) NOT NULL,
  `simpl_comp_type` varchar(15) NOT NULL,
  `simpl_comp_status` int(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `simple_component`
--

INSERT INTO `simple_component` (`id_simple_component`, `simpl_comp_name`, `simpl_comp_value`, `simpl_comp_placeholder`, `simpl_comp_size`, `simpl_comp_formvisibility`, `simpl_comp_treevisibility`, `simpl_comp_type`, `simpl_comp_status`) VALUES
(7, 'ee', '', '', 10, 1, 1, 'text', 1),
(8, 'ee', '', '', 10, 1, 1, 'text', 1),
(9, 'ee', '', '', 10, 1, 1, 'text', 1),
(10, 'ee', '', '', 10, 1, 1, 'text', 1);

-- --------------------------------------------------------

--
-- Structure de la table `value_composed_component`
--

CREATE TABLE IF NOT EXISTS `value_composed_component` (
`id_value_composed_component` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `value_simple_component`
--

CREATE TABLE IF NOT EXISTS `value_simple_component` (
`id_value_simple_component` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `zproject`
--

CREATE TABLE IF NOT EXISTS `zproject` (
`id_project` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `zproject`
--

INSERT INTO `zproject` (`id_project`) VALUES
(3);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `composet_componet`
--
ALTER TABLE `composet_componet`
 ADD PRIMARY KEY (`id_composet_componet`), ADD KEY `id_composer_componet` (`id_composet_componet`), ADD KEY `id_composer_componet_2` (`id_composet_componet`), ADD KEY `id_composet_componet` (`id_composet_componet`);

--
-- Index pour la table `form_container_object`
--
ALTER TABLE `form_container_object`
 ADD PRIMARY KEY (`id_form_container_object`), ADD KEY `id_form_container_object` (`id_form_container_object`), ADD KEY `menu` (`menu`);

--
-- Index pour la table `menu`
--
ALTER TABLE `menu`
 ADD PRIMARY KEY (`id_menu`), ADD KEY `id_super_menu` (`id_super_menu`), ADD KEY `id_project` (`id_project`);

--
-- Index pour la table `relation_container_object`
--
ALTER TABLE `relation_container_object`
 ADD PRIMARY KEY (`relation_container_object`);

--
-- Index pour la table `simple_component`
--
ALTER TABLE `simple_component`
 ADD PRIMARY KEY (`id_simple_component`), ADD KEY `id_simple_component` (`id_simple_component`);

--
-- Index pour la table `value_composed_component`
--
ALTER TABLE `value_composed_component`
 ADD PRIMARY KEY (`id_value_composed_component`), ADD KEY `id_value_composed_component` (`id_value_composed_component`), ADD KEY `id_value_composed_component_2` (`id_value_composed_component`);

--
-- Index pour la table `value_simple_component`
--
ALTER TABLE `value_simple_component`
 ADD PRIMARY KEY (`id_value_simple_component`), ADD KEY `id_value_simple_component` (`id_value_simple_component`), ADD KEY `id_value_simple_component_2` (`id_value_simple_component`);

--
-- Index pour la table `zproject`
--
ALTER TABLE `zproject`
 ADD PRIMARY KEY (`id_project`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `composet_componet`
--
ALTER TABLE `composet_componet`
MODIFY `id_composet_componet` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `form_container_object`
--
ALTER TABLE `form_container_object`
MODIFY `id_form_container_object` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `menu`
--
ALTER TABLE `menu`
MODIFY `id_menu` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `relation_container_object`
--
ALTER TABLE `relation_container_object`
MODIFY `relation_container_object` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `simple_component`
--
ALTER TABLE `simple_component`
MODIFY `id_simple_component` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT pour la table `value_composed_component`
--
ALTER TABLE `value_composed_component`
MODIFY `id_value_composed_component` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `value_simple_component`
--
ALTER TABLE `value_simple_component`
MODIFY `id_value_simple_component` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `zproject`
--
ALTER TABLE `zproject`
MODIFY `id_project` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
