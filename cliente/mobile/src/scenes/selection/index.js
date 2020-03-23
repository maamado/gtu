import React from 'react';
import { SafeAreaView, Text, TouchableHighlight, StyleSheet } from 'react-native';

		//<View style=styles.MainContainer>
const SelectionScreen = ({navigation}) => (
  <SafeAreaView style={ styles.MainContainer }>
			<Text style={ styles.label }>1 km</Text>

			<TouchableHighlight onPress={() => navigation.navigate('Turn')}>
				<Text style={ styles.button }>Comercio Dummy A</Text>
			</TouchableHighlight>
			<TouchableHighlight onPress={() => navigation.navigate('Turn')}>
				<Text style={ styles.button }>Comercio Dummy B</Text>
			</TouchableHighlight>
			<TouchableHighlight onPress={() => navigation.navigate('Turn')}>
				<Text style={ styles.button }>Comercio Dummy C</Text>
			</TouchableHighlight>
  </SafeAreaView>
);

const styles = StyleSheet.create({
 
	MainContainer: {
		// Setting up View inside component in Vertically center.
		justifyContent: 'center',
		// Setting up View inside component align horizontally center.
		alignItems: 'center',
		flex: 1
	},

	label: {
		textAlign: 'center',
		fontSize: 30,
		margin: 10,
		width: 300,
		height: 50,
 	},

	button: {
		textAlign: 'center',
		fontSize: 30,
    fontWeight: 'bold',
		margin: 10,
		width: 300,
		height: 50,
		backgroundColor: 'powderblue'
 	}

});

export default SelectionScreen;
